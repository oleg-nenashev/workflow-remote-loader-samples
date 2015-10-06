/**
 * Dumps environment varibles to the log.
 */

import com.cloudbees.groovy.cps.NonCPS

def version = '1.0'

@NonCPS
def dumpEnvVars() {
  for (Map.Entry<String, String> entry : currentBuild.environment) {
    echo "${entry.key} = ${entry.value}"
  }
}

return this;
