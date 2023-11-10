     var formulario =document.getElementById("enviar").addEventListener("click",validarTodo);
     function validarTodo(e) {
        
                   e.preventDefault();

                    var nombre=document.getElementById("nombre").value;
                    //var nombre2=document.forms["formulario"]["nombre"].value;
                    if (nombre == "") {
                        alert("Tienes que poner tu Nombre ");
                        return false;
                    }

                    var apellido =document.getElementById("apellido").value;
                   // var apellido=document.forms["formulario"]["apellido"].value.length;
                
                    if (apellido == "") {
                        alert("Tienes que poner tus Apellidos.");
                        return false;
                    }
                    var email=document.getElementById("email").value;
                    //var y=document.forms["formulario"]["email"].value.length;
                
                    if (email == "") {
                        alert("Tienes que poner tu correo");
                        return false;
                    }
                    var telefono =document.getElementById("telefono").value;
                   // var y=document.forms["formulario"]["telefono"].value.length;
                
                    if (telefono == "")  {
                        alert("Tienes que poner tu numero de telefono");
                        return false;
                    }
                    var dni=document.getElementById("dni").value;
                  //  var dni=document.forms["formulario"]["dni"].value.length;
                
                    if (dni == 0) {
                        alert("Tienes que poner tu DNI");
                        return false;
                    }
                    var cuidad=document.getElementById("cuidad").value;
                    //var cuidad=document.forms["formulario"]["ciudad"].value.length;
                
                    if (cuidad == 0) {
                        alert("Tienes que poner tu Cuidad");
                        return false;
                    }
                    var pais=document.getElementById("pais").value;
                  //  var pais=document.forms["formulario"]["pais"].value.length;
                
                    if (pais == 0) {
                        alert("Tienes que poner tu Pais");
                        return false;
                    }
                    var date=document.getElementById("date").value;
                   // var date=document.forms["formulario"]["date"].value.length;
                   if (date== "")
                    {
                    alert("Tienes que decidir que dias iras");
                    return false;
                }
                    }
                    
                    var asistencia=document.forms["formulario"]["asistencia"].checked;
                
                    if (asistencia == 0) {
                        alert("Tienes que poner tu fecha de nacimiento.");
                        return false;}
                    
              
               
                