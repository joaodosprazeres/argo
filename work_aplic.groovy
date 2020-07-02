import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import groovy.yaml.YamlSlurper
import groovy.io.FileType

def list = []

def execute(cmd) {
   def proc =  cmd.execute()
   proc.waitFor()
}
def arquivo1 = new File("10-k8s-aplic/values.yaml")
def config1 = new YamlSlurper().parseText(arquivo1.text)

execute("git checkout 74edd53")

def arquivo2 = new File("10-k8s-aplic/values.yaml")
def config2 = new YamlSlurper().parseText(arquivo2.text)

count = 0
for ( e in config1.'k8s-aplic'.argocd.apps ) {
    if(e != config2.'k8s-aplic'.argocd.apps[count]) {
        println "${e.name} \tfoi alterado"
    }
    count++
}

execute("git checkout master")