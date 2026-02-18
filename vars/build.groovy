def call() {
  echo "This is building"
  sh "whoami"
  sh "docker build -t notes-app:latest ."
  echo "Building is successful"
}
