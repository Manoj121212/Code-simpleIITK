import { BrowserRouter,Routes,Route, Navigate,} from 'react-router-dom';
import HeaderComponent from './HeaderComponent'
import LoginComponent from './Logincomponent';
import WelcomeComponent from './WelcomeComponent'
import TaskMangementComponenet from './TaskManagementComponent'
import TTSComponent from './TTSComponent'
import LogoutComponent from   './LogoutComponent'
import FooterComponent from './FooterComponent';
import { useAuth } from "./Security/AuthContext"
import AuthProvider from './Security/AuthContext';
import './TodoApp.css'



function AutheticatedRoute({children}){
    const authContext=useAuth()

    if(authContext.isAuthenticated)
        return children
    return <Navigate to="/"/>
}

export default function Todoapp() {
    return(
        <div className="TodoApp">
            <AuthProvider> 
                <BrowserRouter> 
                <HeaderComponent/>
                    <Routes> 
                        <Route path='/' element={<LoginComponent/>}> </Route>
                        <Route path='/login' element={<LoginComponent/>}> </Route>

                        <Route path='/welcome' element={ 
                        <AutheticatedRoute>
                                  <WelcomeComponent/> 
                         </AutheticatedRoute>
                        }
                        />
                            
                        <Route path='/todo' element={
                            <AutheticatedRoute>
                                    <TaskMangementComponenet/>
                         </AutheticatedRoute>
                       }/> 
                        <Route path='/tts' element={
                            <AutheticatedRoute>
                                        <TTSComponent/>
                            </AutheticatedRoute>
                        }/> 

                        <Route path='/logout' element={
                             <AutheticatedRoute>
                                       <LogoutComponent/>
                            </AutheticatedRoute>
                 }/> 
    
                    </Routes>
                     <FooterComponent/> 
                </BrowserRouter>

            </AuthProvider>
            
        </div>

    )
    
}




 

 
 
 
 