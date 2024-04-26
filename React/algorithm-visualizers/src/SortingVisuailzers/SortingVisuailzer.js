import React, { Component } from 'react'
import './SortingVisualizer.css'
import { getMergeSortAnimations } from './MergeSortAlgorithm.js'

class SortingVisualizer extends Component {

    constructor(props) {
        super(props)
        this.state = {
            array: []
        }
    }

    compoundDidMount() {
        this.resetArray()
    }

    resetArray() {

        const array = []
        for(let i = 0; i < 221; i++) {
            array.push(this.randomValue(5, 600))
        }

        this.setState({array})
    }

    randomValue(min, max) {
        return Math.floor(Math.random() * (max - min + 1) + min)
    }

    mergeSort() {

        const animations = getMergeSortAnimations(this.state.array)

        for(let i = 0; i < animations.length; i++) {
            const arrayBars = document.getElementsByClassName('visualizer-bar')
            const isColourChange = i % 3 !== 2
            if(isColourChange) {
                const [barOneIndex, barTwoIndex] = animations[i]
                const barOneStyle = arrayBars[barOneIndex].style
                const barTwoStyle = arrayBars[barTwoIndex].style
                const color = i % 3 === 0 ? '#0000CC' : '#00CCCC'
                setTimeout(() => {
                    barOneStyle.backgroundColor = color
                    barTwoStyle.backgroundColor = color
                }, i * 5)
            }
            else {
                setTimeout(() => {
                    const [barOneIndex, newHeight] = animations[i]
                    const barOneStyle = arrayBars[barOneIndex].style
                    barOneStyle.height = `${newHeight}px`
                }, i * 5)
            }
        }
    }

    arrayAreEqual(arrayOne, arrayTwo) {

        if(arrayOne.length !== arrayTwo.length) return false;

        for(let i = 0; i < arrayOne.length; i++) {
            if(arrayOne[i] !== arrayTwo[i]) {
                return false;
            }
        }

        return true;
    }

    render() {
        const {array} = this.state

        return (
            <div className = "visualizer">
                <header className = "header">
                    <h2>Sorting Visualizer</h2>
                    <button onClick = {() => this.resetArray()}>Generate New Array</button>
                    <button onClick = {() => this.mergeSort()}>Merge Sort</button>
                </header>
                {
                    array.map((value, index) => (
                        <div 
                            className = "visualizer-bar"
                            key = {index}
                            style = {{
                                backgroundColor: '#00CCCC',
                                height: `${value}px`
                            }}
                        />
                    ))
                }
            </div>
        )
    }
}

export default SortingVisualizer