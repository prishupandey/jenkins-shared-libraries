def call(app, tag, user) {
  echo "This is building"
  sh "whoami"
  sh "docker build -t ${user}/${app}:${tag} ."
  echo "Building is successful"
}
