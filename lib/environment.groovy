/**
 * Dumps environment varibles to the log.
 */

import com.cloudbees.groovy.cps.NonCPS

def version = '1.0'

@NonCPS
def dumpEnvVars() {
  println "Dumping build environment variables..."
  for (Map.Entry<String, String> entry : currentBuild.build().environment) {
    println "    ${entry.key} = ${entry.value}"
  }
}

return this;
