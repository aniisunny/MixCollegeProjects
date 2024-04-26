import React, {useReducer} from 'react';
import './App.css';
import ComponentA from './Components/ComponentA';
import ComponentB from './Components/ComponentB';
import ComponentC from './Components/ComponentC';
import DataFetchingOne from './Components/DataFetchingOne';
import DataFetchingTwo from './Components/DataFetchingTwo';
import ParentComponent from './Components/ParentComponent';
import Counter from './Components/Counter';
import FocusInput from './Components/FocusInput';
import ClassTimer from './Components/ClassTimer';
import HookTimer from './Components/HookTimer';
import DocTitleOne from './Components/DocTitleOne';
import DocTitleTwo from './Components/DocTitleTwo';
import CounterOne from './Components/CounterOne';
import CounterTwo from './Components/CounterTwo';
import UserForm from './Components/UserForm';

export const CountContext = React.createContext()

const initialState = 0
const reducer = (state, action) => {
  switch(action) {
    case 'increment':
      return state + 1
    case 'decrement':
      return state - 1
    case 'reset':
      return initialState
    default:
      return state
  }
}

function App() {

  const [count, dispatch] = useReducer(reducer, initialState)

  return (
    <div className="App">
      <CountContext.Provider
        value={{ countState: count, countDispatch: dispatch }}
      >
      <div>
        Count: {count}
        <ComponentA />
        <ComponentB />
        <ComponentC />
      </div>
    </CountContext.Provider>
    <DataFetchingOne />
    <DataFetchingTwo />
    <ParentComponent />
    <Counter />
    <FocusInput />
    <ClassTimer />
    <HookTimer />
    <DocTitleOne />
    <DocTitleTwo />
    <CounterOne />
    <CounterTwo />
    <UserForm />
    </div>
  );
}
 
export default App;
