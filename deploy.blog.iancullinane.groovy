


// git (github.com key): e6a36c15-1342-4105-9ef8-896857a5781c
//github-key (github-key): 160b6a13-2b6d-4486-b3ff-c0b7dbe6646f


git_creds = 'e6a36c15-1342-4105-9ef8-896857a5781c'
git_url = 'git@github.com:eignhpants/'
project = 'basic-site'
app_url = "${git_url}${project}.git"

node(NODE_LABEL){


    stage "Deploy Blog"
    sh "docker run -d --rm \
        --name iancullinane.com \
        -p 2368:2368 -v /var/lib/ghost/iancullinane:/var/lib/ghost \
        --restart=always \
        ghost"

    //sh 'pm2 start bin/www'
}