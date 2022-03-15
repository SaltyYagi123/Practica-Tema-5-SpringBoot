const getStudentData = async() => {
    //Obtenemos los datos del formulario 
    let input_id = document.getElementById('input_id').value;
    let input_name = document.getElementById('input_name').value;
    let input_email = document.getElementById('input_email').value;
    let input_dob = document.getElementById('input_dob').value;
    let input_age = document.getElementById('input_age').value;

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


