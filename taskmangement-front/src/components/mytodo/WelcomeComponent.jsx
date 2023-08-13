import { Link } from "react-router-dom"
//import axios from "axios"


// function HelloworldRestAPI(){
//     console.log('called')
//     axios.get('http://localhost:8080/users/manoj@restApi/todos')
//     .then(
//         (response) =>Succesfull(response)
//     )
//     .catch((error)=>ErrorResponse(error))
//     .finally(()=>console.log('cleanup'))

// }

// function Succesfull(response){

//     console.log(response)
// }
// function ErrorResponse(error){
//     console.log(error)
// }
export default function WelcomeComponent(){
    return(
        <div className="container"> 
            <div>
                to do lis <Link to='/todo'> Go to  Do list</Link>
            </div>
            {/* <div >
                <button class="btn btn-success m-5" onClick={HelloworldRestAPI}>
                    call rest

                </button>
            </div> */}
     </div>

    )
 }