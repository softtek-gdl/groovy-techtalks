class HelloWorld {

  def name

  def sayHello() {
    "Hello ${name}!"
  }
}

def helloWorld = new HelloWorld(name:'josdem')    
println helloWorld.sayHello()