## About
Single sign-on (SSO) is an authentication scheme that allows a user to log
in with a single ID and password to any of several related, yet independent, 
software systems.  
This app uses auth0 as the SSO provider and manager.

## Features
### This app will:
• Offer user authentication via SSO using at least 3 identity providers (e.g. Facebook,
Gmail, Twitter etc.)  
• Configure SSO integration to get as much as possible data about the end-user  
• Output all data which was provided by the identity providers (e.g. user’s name, age,
gender, email etc.)

## How to use
### Prerequisites
• Intellij or other Java IDE's
• JDK 11+

### Pre-config
• Register at https://auth0.com/  
• Create a new Regular Web Application  
• Follow along with the Quick Start guide to complete the setup  
• Set up as many social connections as you wish  
• Fetch the following fields from the settings and add them to
the `src/main/resources/application.yml` file:  
* `client_id`
* `client_secret`
* `issuer_uri`

### Running
Execute the following command in the project root folder
```bash
> .\gradlew.bat bootRun
```

Now the app is available at `http://localhost:8080/`
