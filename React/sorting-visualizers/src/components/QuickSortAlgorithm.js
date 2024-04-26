export function getQuickSortAnimations (array) {

    const animations = [];
    if (array.length <= 1) {
        return array;
    }

    quickSortHelper (array, 0, array.length - 1, animations);
    return animations;
}

function quickSortHelper (array, low, high, animations) {

    if (low < high) {
        let pi = partition (array, low, high, animations);

        quickSortHelper (array, low, pi - 1, animations);
        quickSortHelper (array, pi + 1, high, animations);
    }
}

function partition (array, low, high, animations) {

    let pivot = array[high];
    let i = low;
    
    for (let j = low; j < high; j++) {
        animations.push ([false, j, high]);

        if (array[j] < pivot) {
            animations.push ([true, i, j]);
            [array[i], array[j]] = [array[j], array[i]];
            ++i;
        }
    }

    animations.push ([true, i, high]);
    [array[i], array[high]] = [array[high], array[i]];

    return i;
}
