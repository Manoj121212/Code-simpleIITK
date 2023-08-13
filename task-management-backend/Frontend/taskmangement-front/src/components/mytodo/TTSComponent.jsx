export default function TTSComponent(){

    const ttsList=[ {Memid:11123,CRM:"Active",CG:"Active",UCRMemId:false,UCRpartyId:false},
                     {Memid:2456,CRM:" Active",CG:"Active",UCRMemId:true,UCRpartyId:true},
                     {Memid:3678,CRM:" Active",CG:"Active",UCRMemId:true,UCRpartyId:true},
                     {Memid:45678,CRM:" Active",CG:"Active",UCRMemId:false,UCRpartyId:false}
 
     ]
     return(
        <div className='container'> 
            <div>
            <table className='table' >
                    <thead> 
                        <tr>
                                <td> Member Id</td>
                                <td> CRM</td>
                                <td> CG  </td>
                                <td> UCR MId </td>
                                <td> UCR partyId </td>

                        </tr>
                    </thead>
                    <tbody> 
                        {
                        ttsList.map(
                            ttslst=>(
                                <tr key={ttslst.Memid}>
                                    <td>{ttslst.Memid} </td>
                                    <td> {ttslst.CRM}</td>
                                    <td> {ttslst.CG }</td>
                                    { <td> {ttslst.UCRMemId.toString()} </td> }
                                    { <td> {ttslst.UCRpartyId.toString()} </td> }

                                </tr>

                                )      

                            )
                        }
                    </tbody>
                </table>
            </div>

        </div>
    )
     
 }
  