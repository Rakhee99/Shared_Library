def call (Map config = [:]){
  loadWindowsScript(fname: 'hello-world.bat')
  bat "./hello-world.bat ${config.fname} ${config.lname}"
}
