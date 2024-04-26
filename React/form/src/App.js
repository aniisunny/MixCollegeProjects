import React from 'react';
import './App.css';
import Form from './Component/Form'
import LifecycleA from './Component/LifecycleA';
import FragmentDemo from './Component/FragmentDemo';
import Table from './Component/Table';
import ParentComp from './Component/ParentComp';
import RefsDemo from './Component/RefsDemo';
import FocusInput from './Component/FocusInput';
import FRParentInput from './Component/FRParentInput';

function App() {
  return (
    <div className="App">
      <Form/>
      <LifecycleA/>
      <FragmentDemo/>
      <Table/>
      <RefsDemo/>
      <FocusInput/>
      <FRParentInput/>
      <ParentComp/>
    </div>
  );
}

export default App;
