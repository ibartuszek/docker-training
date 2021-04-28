# Commands

## Images

### Build
- syntax: `docker build -t <image name> <localtion of dockerfile>`
- example: `docker build -t my-httpd .`

### List
- syntax: `docker images`

### Inspect
- syntax: `docker inspect <image id>`

### Remove:
- syntax: `docker rmi <image id>`
#### Remove all images:
- syntax: `docker rmi $(docker images -q)`
