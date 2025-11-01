# Kubernetes & CI/CD Showcase Project

Welcome to the **Kubernetes & CI/CD Showcase Project**!  
This repository demonstrates how to build, containerize, deploy and manage a Java application using Kubernetes, alongside a CI/CD pipeline. It is meant as a practical example of DevOps and Cloud Native skills.

## 🚀 Project Overview

- A Java application (built with Maven) — code lives in the `src/` folder.  
- A `Dockerfile` to create the application container image.  
- Kubernetes manifests under the `kubernetes/` directory (Deployments, Services, ConfigMaps, etc).  
- A `Jenkinsfile` that defines a CI/CD pipeline: checkout → build → test → build image → push → deploy.  
- Demonstrates end-to-end flow: code → container → cluster.


## 🔧 Technologies Used

- **Spring Boot** (Maven)  
- **Docker** — for containerizing the application  
- **Kubernetes** — for orchestrating the application in a cluster  
- **Jenkins** (or any CI tool) — pipeline defined in `Jenkinsfile`  
- GitHub (or other Git) for version control  

## 🎯 Key Highlights & Skills Demonstrated

- Using Maven to build and test a Java application.  
- Creating a Docker image via `Dockerfile`.  
- Pushing container image to a registry (Docker Hub / private registry).  
- Defining Kubernetes manifests: Deployments, Services, Namespaces.  
- Setting up a CI/CD pipeline using the Jenkins.  
