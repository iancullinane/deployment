
git_creds = 'e6a36c15-1342-4105-9ef8-896857a5781c'
app_url = 'git@github.com:eignhpants/basic-site.git'

node('app-server'){
    stage "Checkout"
    git branch: 'master', credentialsId: 'e6a36c15-1342-4105-9ef8-896857a5781c', url: 'git@github.com:eignhpants/basic-site.git'

    sh "make build"
    //sh 'pm2 start bin/www'
}