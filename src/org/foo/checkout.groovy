// src/org/foo/Zot.groovy
package org.foo
def checkOutFrom(repo) {
  git url: "https://github.com/Rakhee99/${repo}.git/"
}

return this
