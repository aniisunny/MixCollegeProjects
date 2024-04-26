import React, { Component } from 'react'
import './SortingVisualizer.css'
import { getMergeSortAnimations } from './MergeSortAlgorithm.js'
import { getQuickSortAnimations } from './QuickSortAlgorithm'
import { getHeapSortAnimations } from './HeapSortAlgorithm'
import getBubbleSortAnimations from './BubbleSortAlgorithm'
import getSelectionSortAnimations from './SelectionSortAlgorithm'
import getInsertionSortAnimations from './InsertionSortAlgorithm'

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
        for(let i = 0; i < 101; i++) {
            array.push(this.randomValue(5, 600))
        }

        this.setState({array})
    }

    randomValue(min, max) {
        return Math.floor(Math.random() * (max - min + 1) + min)
    }

    selectionSort () {

        const animations = getSelectionSortAnimations (this.state.array)
        const arrayBars = document.getElementsByClassName ('visualizer-bar')

        console.log (animations)

        for (let i = 0; i < animations.length; i++) {
            const [flag, barOneIndex, barTwoIndex] = animations[i]
            const barOneStyle = arrayBars[barOneIndex].style
            const barTwoStyle = arrayBars[barTwoIndex].style

            if (!flag) {
                const color = '#00CCCC'
                const newColor = '#0000CC'

                setTimeout (() => {
                    barOneStyle.backgroundColor = newColor
                    barTwoStyle.backgroundColor = newColor
                }, i * 1)

                setTimeout (() => {
                    barOneStyle.backgroundColor = color
                    barTwoStyle.backgroundColor = color
                }, i * 2)
            }
            else {
                setTimeout (() => {
                    [barOneStyle.height, barTwoStyle.height] = [barTwoStyle.height, barOneStyle.height]
                }, i * 1)
            }
        }
    }

    bubbleSort () {

        const animations = getBubbleSortAnimations (this.state.array)
        const arrayBars = document.getElementsByClassName ('visualizer-bar')

        for (let i = 0; i < animations.length; i++) {
            const [flag, barOneIndex, barTwoIndex] = animations[i]
            const barOneStyle = arrayBars[barOneIndex].style
            const barTwoStyle = arrayBars[barTwoIndex].style
            
            if (!flag) {
                const color = '#00CCCC'
                const newColor = '#0000CC'

                setTimeout (() => {
                    barOneStyle.backgroundColor = newColor
                    barTwoStyle.backgroundColor = newColor
                }, i * 1)

                setTimeout (() => {
                    barOneStyle.backgroundColor = color
                    barTwoStyle.backgroundColor = color
                }, i * 2)
            }
            else {
                setTimeout (() => {
                    [barOneStyle.height, barTwoStyle.height] = [barTwoStyle.height, barOneStyle.height]
                }, i * 1)
            }
        }
    }

    insertionSort () {

        const animations = getInsertionSortAnimations (this.state.array)
        const arrayBars = document.getElementsByClassName ('visualizer-bar')

        for (let i = 0; i < animations.length; i++) {
            const[flag, barOneIndex, barTwoIndex] = animations[i]
            const barOneStyle = arrayBars[barOneIndex].style
            const barTwoStyle = arrayBars[barTwoIndex].style

            if (!flag) {
                const color = '#00CCCC'
                const newColor = '#0000CC'

                setTimeout (() => {
                    barOneStyle.backgroundColor = newColor
                    barTwoStyle.backgroundColor = newColor
                }, i * 1)

                setTimeout (() => {
                    barOneStyle.backgroundColor = color
                    barTwoStyle.backgroundColor = color
                }, i * 2)
            }
            else {
                setTimeout (() => {
                    [barOneStyle.height, barTwoStyle.height] = [barTwoStyle.height, barOneStyle.height]
                }, i * 1)
            }
        }
    }

    mergeSort () {

        const animations = getMergeSortAnimations (this.state.array)
        const arrayBars = document.getElementsByClassName ('visualizer-bar')

        for (let i = 0; i < animations.length; i++) {
            const isColourChange = i % 3 !== 2
            if (isColourChange) {
                const [barOneIndex, barTwoIndex] = animations[i]
                const barOneStyle = arrayBars[barOneIndex].style
                const barTwoStyle = arrayBars[barTwoIndex].style
                const color = i % 3 === 0 ? '#0000CC' : '#00CCCC'
                setTimeout (() => {
                    barOneStyle.backgroundColor = color
                    barTwoStyle.backgroundColor = color
                }, i * 5)
            }
            else {
                setTimeout (() => {
                    const [barOneIndex, newHeight] = animations[i]
                    const barOneStyle = arrayBars[barOneIndex].style
                    barOneStyle.height = `${newHeight}px`
                }, i * 5)
            }
        }
    }

    quickSort () {

        const animations = getQuickSortAnimations (this.state.array)
        const arrayBars = document.getElementsByClassName ('visualizer-bar')

        for (let i = 0; i < animations.length; i++) {
            const [flag, barOneIndex, barTwoIndex] = animations[i]
            const barOneStyle = arrayBars[barOneIndex].style
            const barTwoStyle = arrayBars[barTwoIndex].style
            const color = '#00CCCC'
            const newColor = '#0000CC'
            if (!flag) {
                setTimeout (() => {
                    barOneStyle.backgroundColor = newColor
                    barTwoStyle.backgroundColor = newColor
                }, i * 2)

                setTimeout (() => {
                    barOneStyle.backgroundColor = color
                    barTwoStyle.backgroundColor = color
                }, i * 5)
            }
            else {
                setTimeout (() => {
                    [barOneStyle.height, barTwoStyle.height] = [barTwoStyle.height, barOneStyle.height];
                }, i * 2)
            }
        }
    }

    heapSort () {

        const animations = getHeapSortAnimations (this.state.array)
        const arrayBars = document.getElementsByClassName ('visualizer-bar')
        
        for (let i = 0; i < animations.length; i++) {
            const [largestBarIndex, leftChildBarIndex, rightChildBarIndex] = animations[i]
            const leftChildBarStyle = arrayBars[leftChildBarIndex].style
            const rightChildBarStyle = arrayBars[rightChildBarIndex].style
            if (largestBarIndex !== -1) {
                const largestBarStyle = arrayBars[largestBarIndex].style
                const color = '#00CCCC'
                const newColor = '#0000CC'

                setTimeout (() => {
                    largestBarStyle.backgroundColor = newColor
                    leftChildBarStyle.backgroundColor = newColor
                    rightChildBarStyle.backgroundColor = newColor
                }, i * 5)

                setTimeout (() => {
                    largestBarStyle.backgroundColor = color
                    leftChildBarStyle.backgroundColor = color
                    rightChildBarStyle.backgroundColor = color
                }, i * 10)
            }
            else {
                setTimeout (() => {
                    [leftChildBarStyle.height, rightChildBarStyle.height] = [rightChildBarStyle.height, leftChildBarStyle.height]
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
                    <ul>
                        <li>
                            <b>SORTING VISUALIZER</b>
                        </li>
                        <li class = "liClass">
                            <a href = "#x">
                                <button class = "button HeapSortButton" onClick = {() => this.heapSort ()}>Heap Sort</button>
                            </a>
                        </li>
                        <li class = "liClass">
                            <a href = "#x">
                                <button class = "button QuickSortButton" onClick = {() => this.quickSort ()}>Quick Sort</button>
                            </a>
                        </li>
                        <li class = "liClass">
                            <a href = "#x">
                                <button class = "button MergeSortButton" onClick = {() => this.mergeSort ()}>Merge Sort</button>
                            </a>
                        </li>
                        <li class = "liClass">
                            <a href = "#x">
                                <button class = "button InsertionSortButton" onClick = {() => this.insertionSort ()}>Insertion Sort</button>
                            </a>
                        </li>
                        <li class = "liClass">
                            <a href = "#x">
                                <button class = "button BubbleSortButton" onClick = {() => this.bubbleSort ()}>Bubble Sort</button>
                            </a>
                        </li>
                        <li class = "liClass">
                            <a href = "#x">
                                <button class = "button SelectionSortButton" onClick = {() => this.selectionSort ()}>Selection Sort</button>
                            </a>
                        </li>
                        <li class = "liClass">
                            <a href = "#x">
                                <button class = "button NewArrayButton" onClick = {() => this.resetArray ()}>Generate New Array</button>
                            </a>
                        </li>
                    </ul>
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
