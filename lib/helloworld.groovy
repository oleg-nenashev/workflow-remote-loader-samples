/**
 * Prints a stub message for testing purposes.
 */

def version = '1.0'

def printHello() {
  echo "Hello, world! The version of this file is ${version}"
}

def getVersion() {
  return version;
}

return this;
