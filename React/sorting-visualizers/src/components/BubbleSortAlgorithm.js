export default function getBubbleSortAnimations (array) {

    const animations = [];
    if (array.length <= 1) {
        return array;
    }

    bubbleSort (array, array.length, animations);
    return animations;
}

function bubbleSort (array, length, animations) {

    for (let i = 0; i < length; i++) {
        for (let j = 0; j < length - i - 1; j++) {
            animations.push ([false, j, j + 1]);
            if (array[j] > array[j + 1]) {
                animations.push ([true, j, j + 1]);
                [array[j], array[j + 1]] = [array[j + 1], array[j]];
            }
        }
    }
}
