# CSRF Proof of Concept
These sources are intented to be a proof of concept to avoid CSRF attacks inside the WDW and DLR composite apps.

## Prerequisites to test in your local.
If you want to test this example, you should have the following in your local machine:
  - Tomcat 7.0.56
  - Java 1.7
  - Maven 3.3.3


## How to test it
Please follow these steps to test the example.
  - Clone this repo to your local.
  - Build the project with `mvn clean install`
  - Get the WAR artifact from the `target` folder and deploy it in the `webapp` folder within your tomcat installation
  - Deploy the app by starting the Tomcat container `startup.sh` ( Linux users ) or `startup.bat` ( Windows Users )


## Credits
3 classes were taken from the following repo which were very helpfull to acomplish the goals of the PoC. If you want to take a further view, please check this [link](https://github.com/eyal-lupu/eyallupu-blog) out.
