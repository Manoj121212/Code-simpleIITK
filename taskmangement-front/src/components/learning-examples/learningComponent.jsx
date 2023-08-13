
import FirstComponent,{ FourthComponent } from './Firstcomponent'
import SecondComponent from './SecondComponent'
import ThirdComponent from './ThirdComponent'
//import  { FourthComponent } from './components/learning-examples/Firstcomponent'


export default function LearningComponent() {
    return (
      <div className="App">
        
        
        <FirstComponent> </FirstComponent>
        <SecondComponent></SecondComponent>
        <ThirdComponent> </ThirdComponent>
        <FourthComponent/>
  
      </div>
    );
  }