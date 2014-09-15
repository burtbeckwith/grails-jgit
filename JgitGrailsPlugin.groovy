class JgitGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "2.2 > *"

    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    def title = "Jgit Plugin" 
    def author = "James Jones"
    def authorEmail = "james@gmail.com"
    def description = '''\
Creates a wrapper around the JGit library.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/jgit"

    // Extra (optional) plugin metadata

    // License: one of 'APACHE', 'GPL2', 'GPL3'
    def license = "GPL3"

    // Details of company behind the plugin (if there is one)
    def organization = [ name: "University of South Florida", url: "http://www.usf.edu/" ]

    // Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

    // Location of the plugin's issue tracker.
    def issueManagement = [ system: "github", url: "https://github.com/jamjon3/grails-jgit/issues" ]

    // Online location of the plugin's browseable source code.
    def scm = [ url: "https://github.com/jamjon3/grails-jgit/" ]

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional), this event occurs before
    }

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }

    def onShutdown = { event ->
        // TODO Implement code that is executed when the application shuts down (optional)
    }
}