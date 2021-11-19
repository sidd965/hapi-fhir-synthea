# HAPI-FHIR Starter Project

This project is a complete starter project you can use to deploy a FHIR server using HAPI FHIR JPA.

Note that this project is specifically intended for end users of the HAPI FHIR JPA server module (in other words, it helps you implement HAPI FHIR, it is not the source of the library itself). If you are looking for the main HAPI FHIR project, see here: https://github.com/jamesagnew/hapi-fhir

Need Help? Please see: https://github.com/jamesagnew/hapi-fhir/wiki/Getting-Help

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
