# idempiere-templates
Bndtools templates for iDempiere projects.

## How to use (BETA)

* Install the latest Bndtools 5.2.0 snapshot (or later) in Eclipse: https://github.com/bndtools/bnd#using-the-latest-development-snapshot-build-of-bndbndtools
* Open a fresh workspace.
* Open the Preferences window for Bndtools and go to the Repositories section.
* Enable Template Repositories and add the URL for this repository: https://raw.githubusercontent.com/greekwelfaresa/idempiere-templates/master/dist/index.xml
* Switch to the Bndtools perspective (Window|Perspective|Open Perspective|Other...)

### Set up the workspace
* Right click in the Explorer window and select "New|Bnd OSGi Workspace".
* Select the *iDempiere PostgreSQL Workspace* template (sorry, Oracle not supported yet).
* Enter the details for your database connection.
* Accept the default files structure for copying.

### Set up a new project
* Right click in the Explorer window and select "New|Bnd OSGi Project".
* Choose iDempiere 6.2 Plugin.
* Recommend choosing Java SE 1.8 to build
* Configure the name/package for your plugin.

### Set up a new integration test
* Right click in the Explorer window and select "New|Bnd OSGi Project".
* Choose iDempiere 6.2 Integration Test.
* Configure the name/package of your test plugin.
* Recommend choosing Java SE 1.8 to build
* Configure the name of the project that this will test.
* Once the test is configured, browse to the bnd.bnd file and open it.
* Click on the "Run" tab, and click the "Resolve" button.
* Once the resolution has finished, click ok (there should be no errors) and save the result.
* Now right-click on your integration test project in the Explorer and choose "Run As...|Bnd OSGi Test Launcher (JUnit)". The test should launch and run, with the results displaying in the Eclipse JUnit window.
