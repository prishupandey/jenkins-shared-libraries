def call(app, tag) {
  echo "This is building"
  sh "whoami"
  sh "docker build -t ${app}:${tag} ."
  echo "Building is successful"
}
