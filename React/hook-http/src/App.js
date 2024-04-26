import React from 'react';
import './App.css';
import DataFeching from './Components/DataFetching';
import ComponentC from './Components/ComponentC';
import CounterOne from './Components/CounterOne';
import CounterTwo from './Components/CounterTwo';
import CounterThree from './Components/CounterThree';

export const UserContext = React.createContext()
export const ChannelContext = React.createContext()

function App() {
  return (
    <div className="App">
      <DataFeching />
      <UserContext.Provider value={'Aniruddha M Agrawal'}>
        <ChannelContext.Provider value={'Android, ReactJS'}>
          <ComponentC />
        </ChannelContext.Provider>
      </UserContext.Provider>
      <CounterOne />
      <CounterTwo />
      <CounterThree />
    </div>
  );
}

export default App;
