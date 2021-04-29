# Commands

## Containers

### Run
- syntax: `docker rund -itd --name <container name> -p <host port>:<port in container> <image name>:<tag>`
  - where:
    - `-d` detached mode -> container lif = terminal life
    - `-p` port mapping
- example: `docker run -itd --name my-http-container-1 -p 5555:80 my-httpd:latest`

### List
#### Running containers
- syntax: `docker ps`
#### All containers
- syntax: `docker ps -a`

### Inspect
- syntax: `docker inspect <container id>`

### Logs
- syntax: `docker logs <container id>`
- with tail the logs: `docker logs -ft <container id>`

### Start
- syntax: `docker start <container id>`

### Stop
- syntax: `docker stop <container id>`

### Logging into running container
- syntax: `docker exec -it <container id> /bin/bash`
- to exit: `exit`

### Remove
- syntax: `docker rm <container id>`
#### Remove all containers:
- syntax: `docker rm $(docker ps -a -q)`

### Run ubuntu image locally
- command: `docker run -it ubuntu`