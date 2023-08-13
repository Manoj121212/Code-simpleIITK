
import { useNavigate } from "react-router-dom";
import { useState } from "react";
import { useAuth } from "./Security/AuthContext";

 export default function LoginComponent(){
    const [username,setUsername]=useState(''); //[defualtValue,theupdated value on change event]
    const [password,setPasword]=useState(''); //[defualtValue,theupdated value on change event]
    const [success,SetSuccess]=useState(false); //[defualtValue,theupdated value on change event]
    const [faildMessage,SetFaildMessage]=useState(false); //[defualtValue,theupdated value on change event]
    const navigate= useNavigate();
    const authContext=useAuth();


    
    function HandleUsernameChange(event){
        
        //console.log(newvalue)
        setUsername(event.target.value)
        //console.log(setUsername(event.target.value))
        //console.log(username)
    }
    function HandlePasswordChange(event){

        //console.log(newvalue)
        setPasword(event.target.value)
        //console.log(setUsername(event.target.value))
        //console.log(username)
    }
    function HandleSubmit(){
        if(authContext.login(username,password)){
           // authContext.setAutheticated(true)

            SetSuccess(true)
            SetFaildMessage(false)
            navigate('/welcome')
        }
        else{
            //authContext.setAutheticated(false)

            SetSuccess(false)
            SetFaildMessage(true)
            
        }
    }

    // function SuccessMessageComponent(){
    //     if(success)
    //         return (
    //             <div className='Successmessage'>Authetication Successfull !</div>
    
    //         )
    //         return('')
    
    // }
    // function FailedMessageComponent(){
    //     if(faildMessage)
    //         return (
    //             <div className='Faildmessage'>Authetication faild please check yours credentials !</div>
    
    //         )
    //     return('')
    // }
    
    return(
    <div className="Login"> 
        {success && <div className='Successmessage'>Authetication Successfull !</div>}
        {faildMessage &&   <div className='Faildmessage'>Authetication faild please check yours credentials !</div>}
        {/* <div className='Faildmessage'>Authetication faild please check yours credentials !</div> */}

        <div className="Loginform">
            <div> 
                <label>User Name</label>
                 <input  required type="text" name="username"  placeholder="Enter username"  value={username}  onChange={HandleUsernameChange}  /> 
            </div>
           
            <div> 
                <label> password</label>
                <input required type="password" name="password" placeholder="Enter password"  value={password}  onChange={HandlePasswordChange} /> 
            </div>
            <div> 
                <button type="button" name="login" onClick={HandleSubmit}>login </button>
            </div>
        </div>
    </div>
    )
    
}
