using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace T01_ListBox_IvanSM
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();

            List<Tarea> items = new List<Tarea>();
            items.Add(new Tarea()
            {
                Title = "Complete this WPF tutorial",
                Completion = 45
            });
            items.Add(new Tarea() { Title = "Learn C#", Completion = 80 });
            items.Add(new Tarea() { Title = "Wash the car", Completion = 0 });
            lbTodoList.ItemsSource = items;

        }
    }
}
