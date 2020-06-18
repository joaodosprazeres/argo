# Cluster k8s-apps-des

[![App Status](https://argocd.devops-infra.nuvem.bb.com.br/api/badge?name=kad-k8s-aplic)](https://argocd.devops-infra.nuvem.bb.com.br/applications/kad-k8s-aplic)


Cluster  para execução do Rancher para aplicações críticas - Rancher Apps.

##  Urls de acesso
* URL Ingress: https://ingress.apps.nuvem.desenv.bb.com.br
* URL API:     https://kube-api.apps.nuvem.desenv.bb.com.br
* URL Rancher: https://caas.apps.nuvem.bb.com.br

## Aplicações no ArgoCD
| Aplicação | Status |
| ------ | ------ |
| [Rancher Aplic](https://fontes.intranet.bb.com.br/psc/psc_releases_k8s-apps-des/-/tree/master/00-bootstrap/05-rancher-aplic) | [![App Status](https://argocd.devops-infra.nuvem.bb.com.br/api/badge?name=kad-rancher-aplic)](https://argocd.devops-infra.nuvem.bb.com.br/applications/kra-rancher-aplic) |
| [Calico](https://fontes.intranet.bb.com.br/psc/psc_releases_k8s-apps-des/-/tree/master/20-releases/40-chart/calico) | [![App Status](https://argocd.devops-infra.nuvem.bb.com.br/api/badge?name=kad-calico)](https://argocd.devops-infra.nuvem.bb.com.br/applications/kad-calico) |
| [Nginx Ingress](https://fontes.intranet.bb.com.br/psc/psc_releases_k8s-apps-des/-/tree/master/20-releases/40-chart/nginx-ingress) | [![App Status](https://argocd.devops-infra.nuvem.bb.com.br/api/badge?name=kad-nginx-ingress)](https://argocd.devops-infra.nuvem.bb.com.br/applications/kad-nginx-ingress) |
| [Nas Client](https://fontes.intranet.bb.com.br/psc/psc_releases_k8s-apps-des/-/tree/master/20-releases/40-chart/nas-client) | [![App Status](https://argocd.devops-infra.nuvem.bb.com.br/api/badge?name=kad-nas-client)](https://argocd.devops-infra.nuvem.bb.com.br/applications/kad-nas-client) |
| [Node Manager Operator](https://fontes.intranet.bb.com.br/psc/psc_releases_k8s-apps-des/-/tree/master/20-releases/40-chart/nodemgr-operator) | [![App Status](https://argocd.devops-infra.nuvem.bb.com.br/api/badge?name=kad-nodemgr-operator)](https://argocd.devops-infra.nuvem.bb.com.br/applications/kad-nodemgr-operator) |
| [Namespaces](https://fontes.intranet.bb.com.br/psc/psc_releases_k8s-apps-des/-/tree/master/20-releases/40-chart/k8s-namespaces) | [![App Status](https://argocd.devops-infra.nuvem.bb.com.br/api/badge?name=kad-namespaces)](https://argocd.devops-infra.nuvem.bb.com.br/applications/kad-namespaces) |
| [Proxy Service](https://fontes.intranet.bb.com.br/psc/psc_releases_k8s-apps-des/-/tree/master/20-releases/40-chart/services-proxy) | [![App Status](https://argocd.devops-infra.nuvem.bb.com.br/api/badge?name=kad-proxy)](https://argocd.devops-infra.nuvem.bb.com.br/applications/kad-proxy) |
| [K8S Objects](https://fontes.intranet.bb.com.br/psc/psc_releases_k8s-apps-des/-/tree/master/20-releases/30-k8s-objects) | [![App Status](https://argocd.devops-infra.nuvem.bb.com.br/api/badge?name=kad-k8s-objects)](https://argocd.devops-infra.nuvem.bb.com.br/applications/kad-k8s-objects) |
| [DNS Service Operator](https://fontes.intranet.bb.com.br/psc/psc_releases_k8s-apps-des/-/tree/master/20-releases/40-chart/dnsservice-operator) | [![App Status](https://argocd.devops-infra.nuvem.bb.com.br/api/badge?name=kad-dnsservice-operator)](https://argocd.devops-infra.nuvem.bb.com.br/applications/kad-dnsservice-operator) |
| [Volume Shared Operator](https://fontes.intranet.bb.com.br/psc/psc_releases_k8s-apps-des/-/tree/master/20-releases/40-chart/volume-shared-operator) | [![App Status](https://argocd.devops-infra.nuvem.bb.com.br/api/badge?name=kad-volume-shared-operator)](https://argocd.devops-infra.nuvem.bb.com.br/applications/kad-volume-shared-operator) |

## Informações de releases

| Aplicação | Versão |
| ------ | ------ |
| Kubernetes | 1.17.6 |
| Rancher | 2.4.4 |
| Calico | 3.14.1 |
| Nginx Ingress | 0.32.0 |
| Nas Client | v3.1.0-k8s1.11|

