export default function getInsertionSortAnimations (array) {

    const animations = [];

    if(array.length <= 1) {
        return array;
    }

    insertionSort (array, array.length, animations);
    return animations;
}

function insertionSort (array, length, animations) {

    for (let i = 1; i < length; i++) {
        for (let j = i; j > 0; j--) {
            animations.push ([false, j, j - 1]);
            if (array[j] < array[j - 1]) {
                animations.push ([true, j, j - 1]);
                [array[j], array[j - 1]] = [array[j - 1], array[j]];
            }
        }
    }
}
