# PROGRAM NAME: simple_nn.py
# PROGRAM PURPOSE: Creates a very barebones neural network
# PROGRAMMER: Dillon Pietsch
# DATE WRITTEN: 8/15/17

# Initialize weight of singular node for NN
weight = 0.1

def neural_network(input, weight):
    prediction = input * weight
    return prediction

# 1-D Test Data
number_of_toes = [8.5, 9.5, 10, 9]

# 1-D Result Data
results = []

# Iterate through all of the toes in number_of_toes
for toe in number_of_toes:

    # Get a prediction based off of data and the set weight
    pred = neural_network(toe, weight)

    # Add all of the predictions to the results list
    results.append(round(pred, 4)) # Round function is built-in to Python and rounds a number to X decimal points.

# Show the expected results
print(results)