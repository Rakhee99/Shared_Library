def call (Map config = [:]){
  def scriptcontents = libraryResource "org/foo/${config.fname}"
  writeFile file: "${config.fname}", text : scriptcontents
  bat "./${config.fname}"
}
