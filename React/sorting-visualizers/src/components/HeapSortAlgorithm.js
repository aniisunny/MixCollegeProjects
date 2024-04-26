export function getHeapSortAnimations (array) {

    const animations = [];
    if (array.length <= 1) {
        return array;
    }

    heapSort (array, array.length, animations);
    return animations;
}

function heapSort (array, length, animations) {

    for (let i = Math.floor (length / 2) - 1; i >= 0; i--) {
        heapify (array, length, i, animations);
    }

    for (let i = length - 1; i >= 0; i--) {
        animations.push ([-1, 0, i]);
        [array[0], array[i]] = [array[i], array[0]];
        heapify (array, i, 0, animations);
    }
}

function heapify (array, length, i, animations) {

    let largestIndex = i;
    let leftChildIndex = 2 * i + 1;
    let rightChildIndex = 2 * i + 2;

    if (leftChildIndex < length && rightChildIndex < length) {
        animations.push ([largestIndex, leftChildIndex, rightChildIndex]);
    }

    if (leftChildIndex < length && array[leftChildIndex] > array[largestIndex]) {
        largestIndex = leftChildIndex;
    }
    if (rightChildIndex < length && array[rightChildIndex] > array[largestIndex]) {
        largestIndex = rightChildIndex;
    }

    if (largestIndex !== i) {
        animations.push ([-1, i, largestIndex]);
        [array[i], array[largestIndex]] = [array[largestIndex], array[i]];
        heapify (array, length, largestIndex, animations);
    }
}
