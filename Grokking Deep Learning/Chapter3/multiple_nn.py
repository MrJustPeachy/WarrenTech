# PROGRAM NAME: multiple_nn.py
# PROGRAM PURPOSE: Create a NN with 3 inputs instead of just 1
# PROGRAMMER: Dillon Pietsch
# DATE WRITTEN: 8/15/2017

weights = [0.1, 0.2, 0]
results = []


# Add up all of the weights
def w_sum(a, b):
    assert(len(a) == len(b))

    output = 0

    for i in range(len(a)):
        output += (a[i] * b[i])

    return output


def neural_network(input, weights):
    pred = w_sum(input, weights)
    return pred

# This is a fake dataset of a baseball team 4 games into the season
toes = [8.5, 9.5, 9.9, 9.0]
wlrec = [0.65, 0.8, 0.8, 0.9]
nfans = [1.2, 1.3, 0.5, 1.0]

# Iterate through the games and append the predictions to results list
for i in range(0, len(toes)):
    input = [toes[i], wlrec[i], nfans[i]]

    predict = neural_network(input, weights)

    results.append(round(predict, 4))


# CHALLENGE CODE: Vector math
#   4 challenge methods: elementwise_multiplication, elementwise_addition, vector_sum, vector_average

def elementwise_multiplication(vec_a, vec_b):

    product = []

    for i in range(0, len(vec_a) - 1):
        multiply = vec_a[i] * vec_b[i]
        product.append(round(multiply, 4))

    return product

def elementwise_addition(vec_a, vec_b):

    total = []

    for i in range(0, len(vec_a) - 1):
        addition = vec_a[i] + vec_b[i]
        total.append(round(addition, 4))

    return total

def vector_sum(vec_a):

    return sum(vec_a)

def vector_average(vec_a):

    return sum(vec_a) / len(vec_a)

# Use two of the challenge methods to perform a dot product (weights * inputs)
toes_dot_product = elementwise_multiplication(toes, weights)
wlrec_dot_product = elementwise_multiplication(wlrec, weights)
nfans_dot_product = elementwise_multiplication(nfans, weights)

print("Toes dot product:", toes_dot_product)
print("Wlrec dot product:", wlrec_dot_product)
print("nfans dot product:", nfans_dot_product)


# Print results
print("NN results:", results)