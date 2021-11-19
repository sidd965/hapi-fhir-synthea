# HAPI-FHIR Starter Project

This project is a complete starter project you can use to deploy a FHIR server using HAPI FHIR JPA with the Postgresql database and you can easily generate the patients using synthea.

## Prerequisites

Below are the prerequisites to run this project:

   1- Use Ubuntu Server
   2- Run below commands to clone the project and install pre-requisites tools

      - git clone https://github.com/sidd965/hapi-fhir-synthea.git
      - cd hapi-fhir-synthea
      - ./letstart.sh
      - make tools

## Install HAPI FHIR server and POSTGRES SQL

Run the below command
   - make start

## Un-Install HAPI FHIR server and POSTGRES SQL
Run the below command
  - make stop

## Un-Install HAPI FHIR server and POSTGRES SQL
Generate the patients
  - make synthea
