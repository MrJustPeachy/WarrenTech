# PROGRAM NAME: multiple_outputs.py
# PROGRAM PURPOSE: With one data input output multiple predictions
# PROGRAMMER: Dillon Pietsch
# DATE WRITTEN: 8/16/2017

weights = [0.3, 0.2, 0.9]


def ele_mul(number, vector):
    output = [0, 0, 0]

    assert(len(output) == len(vector))

    for i in range(len(vector)):
        output[i] = number * vector[i]

    return output


def neural_network(input, weights):

    pred = ele_mul(input, weights)

    return pred

wlrec = [0.9, 0.8, 0.8, 0.9]

input = wlrec[0]
pred = neural_network(input, weights)



print(pred)