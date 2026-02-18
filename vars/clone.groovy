def call(String url, String branch) {
  echo 'This is cloning of the code'
  git url: "${url}", branch: "${branch}"
  echo 'Cloning of code is successful'
}
