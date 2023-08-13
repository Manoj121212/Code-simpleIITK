import { Link } from "react-router-dom"
import { useAuth } from "./Security/AuthContext"
export default function HeaderComponent(){
    const authContext=useAuth()
    const isAuthenticatedvalue=authContext.isAuthenticated
    //console.log(authContext)

    function logOut(){
        authContext.logout()
    }
    return(
        <header className="border-bottom border-light border-5 mb-5 p-2">
        <div className="container">
            <div className="row">
                <nav className="navbar navbar-expand-lg">
                    <div className="collapse navbar-collapse">
                        <ul className="navbar-nav">
                             <li className="nav-item fs-5">
                               {isAuthenticatedvalue&& <Link className="nav-link" to="/welcome">Home</Link>}
                               </li>
                               
                             <li className="nav-item fs-5">
                                {isAuthenticatedvalue&&<Link className="nav-link" to="/todo">Task</Link>}
                                </li> 
                             <li className="nav-item fs-5">
                                {isAuthenticatedvalue&&<Link className="nav-link" to="/tts">TTS </Link>}
                                </li> 

                        </ul>
                    </div>
                    <ul className="navbar-nav">
                         <li className="nav-item fs-5">
                            {!isAuthenticatedvalue&&<Link className="nav-link" to="/login">Login</Link>}
                            </li> 

                         <li className="nav-item fs-5">
                            {isAuthenticatedvalue&&<Link className="nav-link" to="/logout" onClick={logOut}>Logout</Link>}
                            </li> 
                    </ul>
                </nav>
            </div>
        </div>
    </header>


    )
 }
