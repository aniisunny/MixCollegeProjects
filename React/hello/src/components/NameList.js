import React from 'react'
import Person from './Person'

function NameList() {
    const names = ['Anii', 'Deeku', 'Bestie', 'Pota Bhai', 'Kittu', 'Lulu', 'Pagal', 'Invisible']
    const nameList = names.map((name, index) => <h2 key = {index}>{index} {name}</h2>)
    const persons = [
        {
            id: 1,
            name: 'Anii',
            age: 20,
            skill: 'Data Structure, Competitive Coding, Android & Web Developer'
        },
        {
            id: 2,
            name: 'Deeku',
            age: 19,
            skill: 'Heart Breaking'
        },
        {
            id: 3,
            name: 'Bestie',
            age: 20,
            skill: 'Changes everytime'
        },
        {
            id: 4,
            name: 'Charu',
            age: 20,
            skill: 'Machine Learning'
        },
        {
            id: 5,
            name: 'Pota Bhai',
            age: 20,
            skill: 'Business Man'
        }
    ]
    const personList = persons.map(
        person => <Person key = {person.id} person = {person}/>
    )
    return (
        <div>
            {
                //names.map(name => <h2>{name}</h2>)
                nameList
                
            }
            {
                personList
            }
        </div>
    )
}

export default NameList