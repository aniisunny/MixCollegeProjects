import React from 'react';
import './App.css';
import PortalDemo from './Components/PortalDemo';
import Hero from './Components/Hero';
import ErrorBoundary from './Components/ErrorBoundary';
import ClickCounter from './Components/ClickCounter';
import HoverCounter from './Components/HoverCounter';
import ClickCounterTwo from './Components/ClickCounterTwo';
import HoverCounterTwo from './Components/HoverCounterTwo';
import User from './Components/User';
import Counter from './Components/Counter';
import ComponentC from './Components/ComponentC';
import { UserProvider } from './Components/userContext';

function App() {
  return (
    <div className="App">
      <PortalDemo/>
      <ErrorBoundary>
        <Hero heroName="Batman"/> 
        <Hero heroName="Superman" />
        <Hero heroName="Joker" />
      </ErrorBoundary>

      <ErrorBoundary>
        <Hero heroName="Batman"/> 
      </ErrorBoundary>

      <ErrorBoundary>
        <Hero heroName="Superman"/> 
      </ErrorBoundary>

      <ErrorBoundary>
        <Hero heroName="Joker"/> 
      </ErrorBoundary>

      <ClickCounter name="Anii" />
      <HoverCounter/>
      
      <User render={(isLoggedIn) => isLoggedIn ? 'Anii' : 'Guest'} />

      <Counter 
        render={(count, incrementCount) => (
          <ClickCounterTwo count={count} incrementCount={incrementCount} />
        )} 
      />

      <Counter 
        render={(count, incrementCount) => (
          <HoverCounterTwo count={count} incrementCount={incrementCount} />
        )} 
      />

      <UserProvider value="Aniruddha">
        <ComponentC />
      </UserProvider>
      <ComponentC />
    </div>
  );
}

export default App;
