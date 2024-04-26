export default function getSelectionSortAnimations (array) {

    const animations = [];

    if (array.length <= 1) {
        return array;
    }

    selectionSort (array, array.length, animations);
    return animations;
}

function selectionSort (array, length, animations) {

    for (let i = 0; i < length - 1; i++) {
        for (let j = i + 1; j < length; j++) {
            animations.push ([false, i, j]);
            if (array[i] > array[j]) {
                animations.push ([true, i, j]);
                [array[i], array[j]] = [array[j], array[i]];
            }
        }
    }
}
