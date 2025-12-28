@echo off
docker build -t getnum:latest -f Dockerfile .
docker tag getnum:latest ehor4ek/getnum:%1
docker push ehor4ek/getnum:%1