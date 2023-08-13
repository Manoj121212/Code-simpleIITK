import { createContext, useContext, useState } from "react";


export const AuthContext=createContext()
export const useAuth=()=>useContext(AuthContext)


export default function AuthProvider({children}){

    const [number,setNumber]=useState(10)
    const [isAuthenticated,setAutheticated]=useState(false)

    function login(userName,password){

            if(userName==="manojtest1@gmail.com" && password==="Manojkdm"){
                setAutheticated(true)
                return true

            }
            else{
                setAutheticated(false)
                return false      
        }
}
    function logout(){
            setAutheticated(false)
        }
    const valueThatsNeedToshare={number,isAuthenticated,login,logout}
//note:: setAutheticated should not be passed generaly to components
       
    return(
        <AuthContext.Provider value={valueThatsNeedToshare}>
            {children}

        </AuthContext.Provider>
    )
}
