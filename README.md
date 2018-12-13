# simple-jaxrs-example
Simple Java 8 jax-rs implementation using resteasy.

It seems like every tutorial is outdated these days in terms of the necessary components to deploy a simple servlet 
using the latest version of resteasy on the latest tomcat 9 or jetty 9 servers.

The context param `resteasy.scan` is deprecated basically. You basically don't need much from a `web.xml` anymore to 
get a simple servlet deployed.

With servlet v3+ servers, you'll need to make sure to include the dependency `resteasy-servlet-initializer`, which I've 
included here.
