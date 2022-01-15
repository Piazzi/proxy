<div align="center">
  <h1> Proxy  </h1>
</div>

# Code

Simple project representing the Proxy design pattern.

# Definition

Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

![image](https://user-images.githubusercontent.com/40416044/149625032-78675788-228c-47d3-8692-3d97e38d4c7f.png)

A proxy, in its most general form, is a class functioning as an interface to something else. The proxy could interface to anything: a network connection, a large object in memory, a file, or some other resource that is expensive or impossible to duplicate. In short, a proxy is a wrapper or agent object that is being called by the client to access the real serving object behind the scenes. Use of the proxy can simply be forwarding to the real object, or can provide additional logic. In the proxy, extra functionality can be provided, for example caching when operations on the real object are resource intensive, or checking preconditions before operations on the real object are invoked. For the client, usage of a proxy object is similar to using the real object, because both implement the same interface.


Source: <a href="https://en.wikipedia.org/wiki/Proxy_pattern"> Wikipedia </a> | <a href="https://refactoring.guru/design-patterns/proxy"> Refactoring Guru </a>
