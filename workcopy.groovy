import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import org.yaml.snakeyaml.Yaml
import groovy.io.FileType

def list = []
def arquivos = []
def entrada = '''20-releases/40-chart/calico/values.yaml
20-releases/40-chart/nas-client/values-nas-client.yaml
'''

List lines = entrada.split( '\n' )
lines.each {
    arquivos << new File(it)
}

def dir = new File(".")
dir.eachFileRecurse (FileType.ANY) { file ->
  list << file
}

list.each {
    if (it.name == "Chart.yaml"){
        def configYaml = new File(it.path).text
        def yaml = new Yaml()
        def config = yaml.load(configYaml)
        if (config.name == "k8s-aplic") {
            println it.path
            println it.parent + "/values.yaml"
            def valuesYaml = new File(it.parent + "/values.yaml").text
            def values = yaml.load(valuesYaml)
            values.'k8s-aplic'.argocd.apps.each { 
                entry -> print "$entry.name \t\t\t\t  $entry.spec.source.path"

                arquivos.find {
                    entry2 ->
                        if(entry.spec.source.path == entry2.parent){
                            print "\t\t\t alterado"
                            return true
                        }
                        return false
                } 
                print "\n"
            }
        }
    }
}

// def configYaml = new File("./10-k8s-aplic/values.yaml").text

// def config = new YamlSlurper().parseText(configYaml)
 
// assert config.'k8s-aplic'.argocd.apps.size() == 10
// 

// assert config.'k8s-aplic'.argocd.apps[0].name == "rancher-aplic"
// assert config.'k8s-aplic'.argocd.apps[1].name == "calico"
// assert config.'k8s-aplic'.argocd.apps[1].name != "rancher-aplic"
// assert config.users.size() == 2
// assert config.users[0] == [name: 'mrhaki', likes: ['Groovy', 'Clojure', 'Java']]
// assert config.users[1] == [name: 'Hubert', likes: ['Apples', 'Bananas']]
 
// assert config.connections == ['WS1', 'WS2']