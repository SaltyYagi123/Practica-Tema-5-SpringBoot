const getStudentData = async() => {
    //Obtenemos los datos del formulario 
    let input_id = document.getElementById('input_id').value;
    let input_name = document.getElementById('input_name').value;
    let input_email = document.getElementById('input_email').value;
    let input_dob = document.getElementById('input_dob').value;
    let input_age = document.getElementById('input_age').value;
    let input_username = document.getElementById('user-name').value;
    let input_password = document.getElementById('user-pass').value;

    //Ahora debemos de hacer un fetch de contactos ? 
    let request = await fetch("/estudiantes", { 
        method: 'POST',
        credentials: "same-origin", 
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify({
            id: parseInt(input_id),
            name: input_name,
            email: input_email,
            dateOfBirth: input_dob,
            age: parseInt(input_age)
        }), 
        dataType: "json"
    })

    if(request.ok) {
        console.log("Success!");
        console.log(await request.json());
    }
}


/*
var sub, user, pass, mainContent, loggedIn;
var loggedIn = document.querySelector('.logged-in')

function _(x) {
  return document.getElementById(x);
}

sub = _('submit');
user = _('user-name');
pass = _('user-pass');
mainContent = _('main');
loggedIn = _('logged-in');

sub.addEventListener('click', login);

function login(event) {
  event.preventDefault();
  var userValue = user.value;
  var passValue = pass.value;
  
  if (userValue.length >= 3 && passValue.length >= 3) {_
      mainContent.classList.add('login-true');
      loggedIn.style.display = 'block';
      loggedIn.innerHTML = '<h2>Welcome, ' + userValue + '</h2>';
   } else {
     alert('Username and Password must contain at least 3 characters.')
   }
}*/