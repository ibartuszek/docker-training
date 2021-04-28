# Docker notes
## Version
### Commands
#### show docker version
`docker version`
must show the docker Client version and its API version, Server version and its API version
#### show docker machine version
`docker-machine version`
#### show docker compose version
`docker-compose version`

## Dockerfile
### params:
- `MAINTAINER` optional refers to the owner -> deprecated use label instead
- `LABEL "Maintainer"="Pictolearn"` 

## apache.httpd
- See Usecase-1
- configured by `httpd.conf` file

## nginx:
- See Usecase-2
- configured by `default.conf` file

## Upload images
- docker hub user needed
- create a repository on <a href="https://hub.docker.com/">hub.docker.com</a>
    - the repository name must be the same on the following commands
- login: `docker login`
- create tag: `docker tag <current image>:<tag> <repository name>/<image name>:<tag>`
    - e.g.: `docker tag my-nginx:latest pictolearn/nginx:1.0`
- push: `docker push <repository name>/<image name>:<tag>`