def call (Map config = [:]){
  def scriptcontents = libraryResource "com/scripts/windows/${config.fname}"
  writeFile file: "${config.fname}", text : scriptcontents
  bat "icacls RX ./${config.fname}"
}
